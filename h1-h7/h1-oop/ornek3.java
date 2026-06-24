public class ornek3 {

    public static void main(String[] args) {
        TV tv1 = new TV(15, 23, true);
        System.out.println(tv1.kanal + "-" + tv1.ses_seviyesi + "-" + tv1.acikmi);
        tv1.kanal_ayarla(45);
        tv1.ses_ayarla(34);
        tv1.TV_kapat();

        TV tv2 = new TV(25, 50, false);
        System.out.println(tv2.kanal + "-" + tv2.ses_seviyesi + "-" + tv2.acikmi);

    }
}

class TV {
    public int kanal = 1;
    public int ses_seviyesi = 1;
    public boolean acikmi = false;

    TV(int kanal, int ses_seviyesi, boolean acik_mi) {
        this.kanal = kanal;
        this.ses_seviyesi = ses_seviyesi;
        this.acikmi = acik_mi;

    }

    public void TV_ac() {
        acikmi = true;

    }

    public void TV_kapat() {
        acikmi = false;
    }

    public void kanal_ayarla(int yeni_kanal) {
        if (acikmi && yeni_kanal != kanal && yeni_kanal <= 120) {
            kanal = yeni_kanal;
        }
    }

    public void ses_ayarla(int yeni_ses) {
        if (acikmi && yeni_ses != ses_seviyesi && ses_seviyesi <= 50) {
            ses_seviyesi = yeni_ses;

        }
    }

    public void birkanakyukari() {
        if (acikmi && kanal < 120) {
            kanal++;

        }
    }

    public void birkanalasagı() {
        if (acikmi && kanal > 1) {

        }
    }

}
