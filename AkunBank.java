public class AkunBank {
    Bank penerbitAkun;
    String nomorAkun;
    double totalSaldo;
    Manusia pemilikAkun;

    AkunBank(Bank bankPenerbitAkun, String nomorAkunNasabahBaru, double saldoAkun, Manusia pemilikAkunBank)
    {
        penerbitAkun = bankPenerbitAkun;
        nomorAkun = nomorAkunNasabahBaru;
        totalSaldo = saldoAkun;
        pemilikAkun = pemilikAkunBank;
    }

    public String getInfoAkun()
    {
        String temp = "";

        temp = nomorAkun + " " + totalSaldo + " " + " " + pemilikAkun.getNama();

        return temp;
     }




}
