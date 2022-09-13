package OOP4;

public class Flight {
    private  String _airlane;
    private String _flightNumber;
    private  String _origin;
    private  String _destin;

    //Constructor


    public Flight(String ar, String fn, String or, String des) {
        this._airlane = ar;
        this._flightNumber = fn;
        this._origin = or;
        this._destin = des;
    }

    public String get_airlane() {
        return _airlane;
    }

    public void set_airlane(String ar) {
        _airlane = ar;
    }

    public String get_flightNumber() {
        return _flightNumber;
    }

    public void set_flightNumber(String fn) {
        this._flightNumber = fn;
    }

    public String get_origin() {
        return _origin;
    }

    public void set_origin(String or) {
        this._origin = or;
    }

    public String get_destin() {
        return _destin;
    }

    public void set_destin(String des) {
        this._destin = des;
    }

    public String toString(){
        return "Flight Information\nAirlane: "+ get_airlane()+ "\nFlightNumber: "+_flightNumber+
                "\nOrigin: "+get_origin()+ "\nDestination: "+get_destin();
    }


}
