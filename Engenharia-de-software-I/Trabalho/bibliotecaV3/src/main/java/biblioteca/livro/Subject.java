package biblioteca.livro;

import biblioteca.usuario.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers(int quantidadeDeReservas);
}
