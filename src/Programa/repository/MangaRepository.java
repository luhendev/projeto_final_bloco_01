package programa.repository;

import programa.model.Manga;
import java.util.List;

public interface MangaRepository {
	
	// CRUID do Mangá

    public void procurarPeloNumero(int numero);
    public void listarMangas();
	public void adicionarManga(Manga manga);
	public void removerManga(int numero);
	
	
}
