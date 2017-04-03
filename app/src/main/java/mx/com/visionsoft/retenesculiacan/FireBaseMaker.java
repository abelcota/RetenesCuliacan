package mx.com.visionsoft.retenesculiacan;

/**
 * Created by Yo on 02/04/2017.
 */

public class FireBaseMaker {
    public String fecha;
    public double latitude;
    public double longitude;
    public String descripcion;


    //required empty constructor
    public FireBaseMaker() {
    }

    public FireBaseMaker(double latitude, double longitude, String fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
