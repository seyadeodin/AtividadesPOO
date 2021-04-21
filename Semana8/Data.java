package Semana8;

class Data {
    private int dia, mes, ano;
    
    public void Data() {
        dia = 0;
        mes = 0;
        ano = 0;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void displayData() {
        System.out.println(dia+"/"+mes+"/"+ano);
    }
}
