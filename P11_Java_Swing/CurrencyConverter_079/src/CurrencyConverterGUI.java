import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CurrencyConverterGUI {
    private JComboBox MataUangAwal, MataUangAkhir;
    private JTextField JumlahUang;
    private JButton konversiButton;
    private JTextField ConvertedLabel;
    private JLabel HasilKonversi;
    private JPanel Currency_Converter;

    public CurrencyConverterGUI() {
        MataUangAwal.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        MataUangAkhir.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        konversiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MataUangAwal.getSelectedItem() == MataUangAkhir.getSelectedItem()){
                    ConvertedLabel.setText(JumlahUang.getText());
                } else if (MataUangAwal.getSelectedItem() == "Rupiah" && MataUangAkhir.getSelectedItem() == "Ringgit"){
                    convertRupiahRinggit();
                } else if (MataUangAwal.getSelectedItem() == "Rupiah" && MataUangAkhir.getSelectedItem() == "Baht"){
                    convertRupiahBaht();
                } else if (MataUangAwal.getSelectedItem() == "Rupiah" && MataUangAkhir.getSelectedItem() == "Dollar"){
                    convertRupiahDollar();
                }
            }
        });
    }

    public void convertRupiahRinggit(){
        float RupiahRinggit = (float) ((Double.parseDouble(JumlahUang.getText())) * 0.00030);
        ConvertedLabel.setText(String.format("%.2f", RupiahRinggit));
    }

    public void convertRupiahBaht(){
        float RupiahBaht = (float) ((Double.parseDouble(JumlahUang.getText())) * 0.0023);
        ConvertedLabel.setText(String.format("%.2f", RupiahBaht));
    }

    public void convertRupiahDollar(){
        float RupiahDollar = (float) ((Double.parseDouble(JumlahUang.getText())) * 0.000062);
        ConvertedLabel.setText(String.format("%.2f", RupiahDollar));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CurrencyConverterGUI().Currency_Converter);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
