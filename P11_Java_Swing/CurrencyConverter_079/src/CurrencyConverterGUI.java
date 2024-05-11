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
                } else if (MataUangAwal.getSelectedItem() == "Ringgit" && MataUangAkhir.getSelectedItem() == "Rupiah"){
                    convertRinggitRupiah();
                } else if (MataUangAwal.getSelectedItem() == "Ringgit" && MataUangAkhir.getSelectedItem() == "Baht"){
                    convertRinggitBaht();
                } else if (MataUangAwal.getSelectedItem() == "Ringgit" && MataUangAkhir.getSelectedItem() == "Dollar"){
                    convertRinggitDollar();
                } else if (MataUangAwal.getSelectedItem() == "Baht" && MataUangAkhir.getSelectedItem() == "Ringgit"){
                    convertBahtRinggit();
                } else if (MataUangAwal.getSelectedItem() == "Baht" && MataUangAkhir.getSelectedItem() == "Rupiah"){
                    convertBahtRupiah();
                } else if (MataUangAwal.getSelectedItem() == "Baht" && MataUangAkhir.getSelectedItem() == "Dollar"){
                    convertBahtDollar();
                } else if (MataUangAwal.getSelectedItem() == "Dollar" && MataUangAkhir.getSelectedItem() == "Ringgit"){
                    convertDollarRinggit();
                } else if (MataUangAwal.getSelectedItem() == "Dollar" && MataUangAkhir.getSelectedItem() == "Rupiah"){
                    convertDollarRupiah();
                } else if (MataUangAwal.getSelectedItem() == "Dollar" && MataUangAkhir.getSelectedItem() == "Baht"){
                    convertDollarBaht();
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

    public void convertRinggitRupiah(){
        float RinggitRupiah = (float) ((Double.parseDouble(JumlahUang.getText())) * 3388.92);
        ConvertedLabel.setText(String.format("%.2f", RinggitRupiah));
    }

    public void convertRinggitBaht(){
        float RinggitBaht = (float) ((Double.parseDouble(JumlahUang.getText())) * 7.73);
        ConvertedLabel.setText(String.format("%.2f", RinggitBaht));
    }

    public void convertRinggitDollar(){
        float RinggitDollar = (float) ((Double.parseDouble(JumlahUang.getText())) * 0.21);
        ConvertedLabel.setText(String.format("%.2f", RinggitDollar));
    }

    public void convertBahtRupiah(){
        float BahtRupiah = (float) ((Double.parseDouble(JumlahUang.getText())) * 437.94);
        ConvertedLabel.setText(String.format("%.2f", BahtRupiah));
    }

    public void convertBahtRinggit(){
        float BahtRinggit = (float) ((Double.parseDouble(JumlahUang.getText())) * 0.12878);
        ConvertedLabel.setText(String.format("%.2f", BahtRinggit));
    }

    public void convertBahtDollar(){
        float BahtDollar = (float) ((Double.parseDouble(JumlahUang.getText())) * 0.027);
        ConvertedLabel.setText(String.format("%.2f", BahtDollar));
    }

    public void convertDollarRupiah(){
        float DollarRupiah = (float) ((Double.parseDouble(JumlahUang.getText())) * 16055);
        ConvertedLabel.setText(String.format("%.2f", DollarRupiah));
    }

    public void convertDollarRinggit(){
        float DollarRinggit = (float) ((Double.parseDouble(JumlahUang.getText())) * 4.74);
        ConvertedLabel.setText(String.format("%.2f", DollarRinggit));
    }

    public void convertDollarBaht(){
        float DollarBaht = (float) ((Double.parseDouble(JumlahUang.getText())) * 36.66);
        ConvertedLabel.setText(String.format("%.2f", DollarBaht));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CurrencyConverterGUI().Currency_Converter);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
