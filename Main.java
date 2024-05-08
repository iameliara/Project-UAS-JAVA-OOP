import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        boolean ulangi = true;

        double dataTotalSimpanan;
        double dataKreditTersalurkan;
        String dataNamaBank;
        String ulangiLooping;
        Bank objectBank;

        Bank [] objectBankArray = new Bank [100];
        int jumlahBank = 0;


        Scanner dataInputDariKeyboard = new Scanner(System.in);

        while (ulangi == true) {
            dataInputDariKeyboard = new Scanner(System.in);
            System.out.println(" Nama Bank : ");
            dataNamaBank = dataInputDariKeyboard.nextLine();
            System.out.println(" Total Simpanan : ");
            dataTotalSimpanan = dataInputDariKeyboard.nextDouble();
            System.out.println(" Total Kredit Tersalurkan : ");
            dataKreditTersalurkan = dataInputDariKeyboard.nextDouble();
            objectBank = new Bank(dataNamaBank, dataTotalSimpanan, dataKreditTersalurkan);

            System.out.println(objectBank.getBankInfo());
            objectBankArray[jumlahBank] = objectBank;
            jumlahBank = jumlahBank + 1;


            System.out.println(" ulangi ? (true | false) ");
            ulangiLooping = dataInputDariKeyboard.next();
            if (ulangiLooping.equalsIgnoreCase("false")) {
                ulangi = false;
            }
        }

            for (int index=0; index<jumlahBank;index++)
            {
                System.out.println(objectBankArray[index].getBankInfo());
            }

            Manusia objectManusia1 = new Manusia("Fulan");
            Manusia objectManusia2 = new Manusia("Fulanah");

            AkunBank objectAkun1 = new AkunBank(objectBankArray[0], "001", 10000,objectManusia1);
            AkunBank objectAkun2 = new AkunBank(objectBankArray[0], "002", 20000,objectManusia2);

            objectBankArray[0].addAkunDimilikiBank(objectAkun1);
            objectBankArray[0].addAkunDimilikiBank(objectAkun2);

            objectBankArray[0].getAkunInfo();

        SimpulAkunBank objectAkunSimpul1 = new SimpulAkunBank(objectBankArray[0], "003", 10000,objectManusia1);
        SimpulAkunBank objectAkunSimpul2 = new SimpulAkunBank(objectBankArray[0], "004", 10000,objectManusia1);



        objectBankArray[0].addakunBankDalamBentuLinkedList(objectAkunSimpul1);
        objectBankArray[0].addakunBankDalamBentuLinkedList(objectAkunSimpul2);




        System.out.println("cetak isi linked list dari salah satu bank");

        objectBankArray[0].getIsi();

















    }
}