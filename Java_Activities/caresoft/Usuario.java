package Java_Activities.caresoft;

public class Usuario {
    protected Integer id;
    protected int pin;


    public Usuario(Integer id) {
        this.id = id;
    }

    /*GETTERS Y SETTERS */
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    
    // PARA HACER: Getters y Setters
    // Implementar un constructor que tome un ID
}

