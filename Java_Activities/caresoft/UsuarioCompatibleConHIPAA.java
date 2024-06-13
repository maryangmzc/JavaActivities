package Java_Activities.caresoft;

public interface UsuarioCompatibleConHIPAA {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
