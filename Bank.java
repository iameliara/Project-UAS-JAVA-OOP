public class Bank {

    String namaBank;
    private double totalSimpananBank;
    private double totalKreditBankTersalurkan;

    AkunBank akunDimilikiBank[];

    LinkListAkunBank akunBankDalamBentuLinkedList = new LinkListAkunBank();

    int totalAkunDimilikiBank =0;


    public void getIsi()
    {
        akunBankDalamBentuLinkedList.cetakLinkListAkunBank();
    }

    public void addakunBankDalamBentuLinkedList(SimpulAkunBank akunBankBaru)
    {
        akunBankDalamBentuLinkedList.addSimpulAkunBank(akunBankBaru);
    }



    public void addAkunDimilikiBank(AkunBank akunBankBaru)
    {
        akunDimilikiBank[totalAkunDimilikiBank] = akunBankBaru;
        totalAkunDimilikiBank = totalAkunDimilikiBank + 1;
    }


    Bank( String nama, double totalSimpanan, double totalKredit)
    {
        this.namaBank = nama;
        this.totalSimpananBank = totalSimpanan;
        this.totalKreditBankTersalurkan = totalKredit;
        akunDimilikiBank = new AkunBank[1000];

    }


    public void addTotalSimpananBank(double totalSimpanan)
    {
        totalSimpananBank = totalSimpananBank + totalSimpanan;
    }

    public void addTotalKreditBankTersalurkan(double totalKreditTersalurkan)
    {
        totalKreditBankTersalurkan = totalKreditBankTersalurkan + totalKreditTersalurkan;
    }

    public void setNamaBank (String nama)
    {
        this.namaBank = nama;
    }

    public double getTotalSimpananBank()
    {
        return totalSimpananBank;
    }

    public double totalKreditBankTersalurkan()
    {
        return totalKreditBankTersalurkan;
    }

    public String getNamaBank()
    {
        return namaBank;
    }

    public String getBankInfo()
    {
        String bankInfo  = namaBank +" Total Simpanan : "+ totalSimpananBank +" Total Kredit Tersalurkan : " + totalKreditBankTersalurkan;

        return bankInfo;
    }

    public void getAkunInfo()
    {
        for (int index=0; index<totalAkunDimilikiBank;index++)
        {
            System.out.println(akunDimilikiBank[index].getInfoAkun());
        }

    }

}
