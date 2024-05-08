public class LinkListAkunBank {

    SimpulAkunBank header;


    public void addSimpulAkunBank(SimpulAkunBank akunBankBaru)
    {
        if (header ==null)
        {
            header = akunBankBaru;
        }
        else
        {
            akunBankBaru.next = header;
            header = akunBankBaru;
        }
    }

    public void cetakLinkListAkunBank()
    {
        for(SimpulAkunBank t = header;t!=null;t=t.getNext())
        {
            System.out.println(t.getInfoAkun());
        }
    }
}
