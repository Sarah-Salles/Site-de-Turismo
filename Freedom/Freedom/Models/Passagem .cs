namespace Freedom.Models
{
    public class Passagem
    {
        public Guid Id { get; set; }
        public Cidade Cidade { get; set; }
        public double Valor { get; set; }
        public double Desconto { get; set; }
        public double Valor_promocional { get; set; }
        public string Data_ida { get; set; }
        public string Data_volta { get; set; }
    }
}
