public class LaptopModel {
    private String model;
    private String serialnumber;

    public LaptopModel(String model, String serialnumber) {
        this.model = model;
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((serialnumber == null) ? 0 : serialnumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LaptopModel other = (LaptopModel) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (serialnumber == null) {
            if (other.serialnumber != null)
                return false;
        } else if (!serialnumber.equals(other.serialnumber))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "модель = " + model + ", серийный номер = " + serialnumber + " ";
    }
}
