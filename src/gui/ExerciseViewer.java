package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import exercise.ExerciseInput;
import exerciseManagementSystem.ExerciseClassmanager;

public class ExerciseViewer extends JPanel{
	WindowFrame frame;
	
	ExerciseClassmanager exerciseManager;
	
	public ExerciseViewer(WindowFrame frame, ExerciseClassmanager exerciseManager) {
		this.frame = frame;
		this.exerciseManager = exerciseManager;
		
		System.out.println("***" + exerciseManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();	//table의 model을 생성.
		model.addColumn("Part");	//model의 이름설정.
		model.addColumn("Set");
		model.addColumn("Times");
		
		for(int i = 0; i<exerciseManager.size(); i++) {
			Vector row = new Vector();
			ExerciseInput ex = exerciseManager.get(i);
			row.add(ex.getPart());
			row.add(ex.getSet());
			row.add(ex.getTimes());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);	//JTable의 table을 생성하여 model을 넣어줌.
		JScrollPane sp = new JScrollPane(table);	//table의 scroll기능 설정.
		
		this.add(sp);	//scroll기능 추가.
		
	}
}
