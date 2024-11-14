package programa.repository;

import programa.model.Manga;

public interface MangaRepository {
    
    // CRUID do Mangá

    public Manga procurarPeloNumero(int numero);
    public void listarMangas();
    public void adicionarManga(Manga manga);
    public void removerManga(int numero);
}
