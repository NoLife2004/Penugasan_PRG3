import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HitungNilai {
    public JPanel Home, Input, Hasil;
    private JTextField pretestField, quizField, utsField, uasField, proyekField;
    private JButton hitungButton;
    private JLabel rataInfo, totalInfo, gradeInfo;


    public HitungNilai() {

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitung();
            }
        });
    }

    private void hitung(){
        String grade;
        double pretest = Double.parseDouble(pretestField.getText());
        double quiz = Double.parseDouble(quizField.getText());
        double uts = Double.parseDouble(utsField.getText());
        double uas = Double.parseDouble(uasField.getText());
        double proyek = Double.parseDouble(proyekField.getText());

        double total = pretest + quiz + uts + uas + proyek;
        totalInfo.setText(Double.toString(total));
        double rata = total / 5;
        rataInfo.setText(Double.toString(rata));
        if (rata >= 85){
            grade = "A";
        } else if (rata >= 75 && rata <= 84){
            grade = "B";
        } else if (rata >= 65 && rata <= 74){
            grade = "C";
        } else {
            grade = "Anda di DO!!!!!!!!!";
        }
        gradeInfo.setText(grade);

    }
}
