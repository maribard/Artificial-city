import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawCar {
    private static void createAndShowUI() {
        final TestPanel panel = new TestPanel();
        panel.validate();
        JFrame frame = new JFrame("DrawCar");
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600,580 ));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static class TestPanel extends JPanel {
    	List<Car> carList = new LinkedList<Car>();
		RoadNetwork rn = new RoadNetwork();
		Spawner spawner = new Spawner(rn, carList);
		LightsManager lm= new LightsManager(rn.lightCrossoverList);
        BufferedImage img = null;

        public TestPanel() {
            try {
                img = ImageIO.read(new File("D:/Download/java/konrad/mapa1.jpg"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            Dimension dimension = new Dimension(img.getWidth(), img.getHeight());
            setPreferredSize(dimension);

            lm.start();
            if(Parameters.starting){
            	rn.startingCarSpawner(spawner);
            }
            

            ActionListener timerAction = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                        updateList();
                        repaint();
                }
            };
            
            Timer timer = new Timer((int)(1000/Parameters.speed), timerAction);
            timer.setRepeats(true);
            timer.start();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, this);
            g.setColor(Color.RED);
            for (Car car : carList) {
                car.drawCar(g);
            }
        }
        
        public void updateList(){
        	/*
			iterator = carList.iterator();
			while(iterator.hasNext()){
				  Car car = iterator.next();
				  car.updatePosition();				    
			}
			iterator = carList.iterator();
			while(iterator.hasNext()){
				  Car car = iterator.next();
				  if(car.position==-1){
					  iterator.remove();
				  }
			}
			spawner.globalSpawn();*/
        	lm.globalLightsUpdate();
        	System.out.print(lm.lightCrossovers.get(0).options.get(4).isON + "    ");
        	System.out.println(lm.lightCrossovers.get(0).optionGroup);
        	Iterator<Street> iterator = rn.streetList.iterator();
			while(iterator.hasNext()){
			  Street street = iterator.next();
			  for(int j=street.streetParts.length-1; j>=0; j--){
				  Car car = street.streetParts[j].car;
				  if(car != null){
					  if(car.position==car.street.streetParts.length-1 && car.isEnding==false){
						  car.ruch_na_skrzyzowaniu();
					  }
					  else car.normalny_ruch();
				  }
			  }
			}
			
			Iterator<Car> it = carList.iterator();
			while(it.hasNext()){
				  Car car = it.next();
				  car.updatePosition();				    
			}
			it = carList.iterator();
			while(it.hasNext()){
				  Car car = it.next();
				  if(car.position==-1){
					  it.remove();
				  }
			}
			spawner.globalSpawn();
        }
    }

    public static void main(String[] args) {
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowUI();
            }
        });
    }
}