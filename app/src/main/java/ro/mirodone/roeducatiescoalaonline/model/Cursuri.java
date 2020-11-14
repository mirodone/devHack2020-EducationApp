package ro.mirodone.roeducatiescoalaonline.model;

public class Cursuri {

        private String numeCurs;
        private String descriereCurs;
        private int imagineCursId;

    public Cursuri(String numeCurs, String descriereCurs, int imagineCursId) {
        this.numeCurs = numeCurs;
        this.descriereCurs = descriereCurs;
        this.imagineCursId = imagineCursId;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public String getDescriereCurs() {
        return descriereCurs;
    }

    public void setDescriereCurs(String descriereCurs) {
        this.descriereCurs = descriereCurs;
    }

    public int getImagineCursId() {
        return imagineCursId;
    }

    public void setImagineCursId(int imagineCursId) {
        this.imagineCursId = imagineCursId;
    }
}
