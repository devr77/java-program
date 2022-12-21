/**
 * Atom
 * @author Alpha Olomi <hello@alphaolomi.com>
 * @version 1.0 
 * @see Test one 2018 
 */
public class Atom {

    protected int number_of_proton;
    protected int number_of_electron;
    protected int number_of_neutron;

    public void setNumberOfProton(int proton) {
        if (proton < 1) {
            System.out.println("minimum is 1");
        } else {
            this.number_of_proton = proton;
        }
    }

    public void setNumberOfElectron(int electron) {
        if (proton < 1) {
            System.out.println("minimum is 1");
        } else {
            this.number_of_proton = electron;
        }
    }

    public void setNumberOfNeutron(int neutron) {
        if (proton < 1) {
            System.out.println("minimum is 0");
        } else {
            this.number_of_proton = proton;
        }
    }

    public Atom() {
        this.number_of_electron = 1;
        this.number_of_neutron = 0;
        this.number_of_proton = 1;

    }

    public int getNumberOfProton() {
        return this.number_of_proton;
    }

    public int getNumberOfElectron() {
        return this.number_of_electron;
    }

    public int getNumberOfNeutron() {
        return this.number_of_neutron;
    }

    public boolean isIon() {
        if (this.number_of_electron != this.number_of_proton) {
            return true;
        } else {
            return false;

        }
    }

    public double getAtomicMassNumber() {
        double A = this.number_of_proton + this.number_of_electron;
        return A;
    }
}