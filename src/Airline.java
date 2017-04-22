
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;  
  
public class Airline implements ActionListener{  
	
	JFrame f;  
	JMenuBar mb;  
	JMenu makeTrip,view;  
	JMenuItem   fillDetails,viewFlights, yourTrip;
	
	Airline()
	{  
		f=new JFrame();  
  
		fillDetails=new JMenuItem("Fill Details");  
		viewFlights=new JMenuItem("View Flights");  
		yourTrip=new JMenuItem("Your Trip");  
		  
  
		fillDetails.addActionListener(this);  
		viewFlights.addActionListener(this);  
		yourTrip.addActionListener(this);    
  
		mb=new JMenuBar();  
		mb.setBounds(5,3,1000,40);  
  
		makeTrip=new JMenu("Make Trip");  
		view=new JMenu("View");  
		  

		mb.add(makeTrip);
		makeTrip.add(fillDetails);
		mb.add(view);
		view.add(viewFlights);
		view.add(yourTrip);	
		f.add(mb);		
		
		f.setLayout(null);  
		f.setSize(500,500);  
		f.setVisible(true);  
	}  
  
	@Override
	public void actionPerformed(ActionEvent e) {  
		if(e.getSource() == fillDetails)
		{
			FillDetailsFrame fnew=new FillDetailsFrame();
			f.setVisible(false);
		}
	}  
  
	public static void main(String[] args) {  
		new Airline();  
	}  
}  

class FillDetailsFrame extends JFrame{
	JFrame fnew;
	public FillDetailsFrame() {
		fnew = new JFrame();
		fnew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fnew.setSize(500,500);
		fnew.setVisible(true);
		fnew.setTitle("Fill Details");
		// TODO Auto-generated constructor stub
	}
}