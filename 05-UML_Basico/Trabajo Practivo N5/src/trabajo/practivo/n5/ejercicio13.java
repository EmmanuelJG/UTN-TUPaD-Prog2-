
package javaapp.TP5;

public class ejercicio13 {

    public class Usuario{
        private String nombre, email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    
    public class CodigoQR{
        private String valor;
        private Usuario user;

        public CodigoQR(String valor, Usuario user) {
            this.valor = valor;
            this.user = user;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }

        public Usuario getUser() {
            return user;
        }

        public void setUser(Usuario user) {
            this.user = user;
        }
        
    }
    
    public class GeneradorQR{
        
        public void generar(String valor, Usuario user){
            CodigoQR new_qr = new CodigoQR(valor, user);
            System.out.println("Usuario: "+ new_qr.getUser().getNombre()+"\nCódigo QR: " + 
                    new_qr.getValor());
        }
    }
}
