public class EstudianteIngenieria {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int numeroSemestre;
    private float promedioAcumulado;
    private String serial;

    // Constructor
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, float promedioAcumulado, String serial) {
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setNumeroSemestre(numeroSemestre);
        setPromedioAcumulado(promedioAcumulado);
        setSerial(serial);
    }

    // Getters y Setters con validaciones
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        
        if (cedula.matches("[0-9]+")) {
            this.cedula = cedula;
        } else {
            throw new IllegalArgumentException("Cédula inválida. Solo se permiten números.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.matches("[a-zA-Z]+")) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre inválido. No se permiten números ni caracteres especiales.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.matches("[a-zA-Z]+")) {
            this.apellido = apellido;
        } else {
            throw new IllegalArgumentException("Apellido inválido. No se permiten números ni caracteres especiales.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.matches("[0-9]+")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Teléfono inválido. No se permiten caracteres especiales.");
        }
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        if (numeroSemestre > 0) {
            this.numeroSemestre = numeroSemestre;
        } else {
            throw new IllegalArgumentException("Número de semestre inválido. Debe ser un número entero positivo.");
        }
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        if (promedioAcumulado >= 0.0 && promedioAcumulado <= 5.0) {
            this.promedioAcumulado = promedioAcumulado;
        } else {
            throw new IllegalArgumentException("Promedio acumulado inválido. Debe ser un número flotante entre 0.0 y 5.0.");
        }
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        if (serial.matches("[a-zA-Z0-9]+")) {
            this.serial = serial;
        } else {
            throw new IllegalArgumentException("Serial inválido. No se permiten caracteres especiales.");
        }
    }

    @Override
    public String toString() {
        return "EstudianteIngenieria{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroSemestre=" + numeroSemestre +
                ", promedioAcumulado=" + promedioAcumulado +
                ", serial='" + serial + '\'' +
                '}';
    }
}
