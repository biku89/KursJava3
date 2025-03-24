public record Osoba(String imie, String nazwisko, String numer) { //Wszystko co masz w nawiasie jest private and final


    @Override
    public String imie() {
        return imie;
    }

    @Override
    public String nazwisko() {
        return nazwisko;
    }

    @Override
    public String numer() {
        return numer;
    }
}
