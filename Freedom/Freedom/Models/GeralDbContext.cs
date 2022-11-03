using Microsoft.EntityFrameworkCore;

namespace Freedom.Models
{
    public class GeralDbContext : DbContext
    { 
    public GeralDbContext(DbContextOptions<GeralDbContext> options)
     : base(options)
    { }
    public DbSet<Cidade> Cidades { get; set; }
    public DbSet<Usuario> Usuarios { get; set; }

     public DbSet<Cargo> Cargos { get; set; }
    public DbSet<Passagem> Passagens { get; set; }

    }
}
