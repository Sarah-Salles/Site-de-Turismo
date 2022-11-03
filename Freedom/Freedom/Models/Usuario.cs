namespace Freedom.Models
{
    public class Usuario
    {
        public Guid Id { get; set; }    
        public Cargo Cargo { get; set; }
        public string Nome { get; set; }
        public double Cpf { get; set; }
        public string Email { get; set; }
        public string Password { get; set; }
    }
}
