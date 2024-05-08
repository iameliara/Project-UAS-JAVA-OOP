public class SimpulAkunBank extends AkunBank{

    SimpulAkunBank next;

   SimpulAkunBank(Bank bankPenerbitAkun, String nomorAkunNasabahBaru, double saldoAkun, Manusia pemilikAkunBank)
   {
       super(bankPenerbitAkun,nomorAkunNasabahBaru,saldoAkun,pemilikAkunBank);

       next = null;

   }

public void setNext(SimpulAkunBank akunBankBaru)
{
    next = akunBankBaru;
}

public SimpulAkunBank getNext()
{
    return next;
}




}
