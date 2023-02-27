public class User {
    private String birthdate;
    private Number size;
    private Photo photos;
    private Address address;


    public User(String birthdate, Number size, Photo photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }


    public String getBirthdate() {
        return birthdate;
    }


    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    public Number getSize() {
        return size;
    }


    public void setSize(Number size) {
        this.size = size;
    }


    public Photo getPhotos() {
        return photos;
    }


    public void setPhotos(Photo photos) {
        this.photos = photos;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    

    
}
