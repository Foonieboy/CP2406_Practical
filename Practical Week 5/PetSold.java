/**
 * Created by Rico on 12/13/2016.
 */
public class PetSold extends ItemSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean houseBroken;

    public PetSold(int number, String description, double price, boolean vaccinated, boolean neutered, boolean houseBroken)
    {
        super(number, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.houseBroken = houseBroken;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHouseBroken() {
        return houseBroken;
    }

    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }
}
