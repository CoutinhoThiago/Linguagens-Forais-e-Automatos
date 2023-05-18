package interfaces.espefcificas;

import interfaces.IItemBiblioteca;

public interface IMedia extends IItemBiblioteca{
	int getDuracaoEmMinutos();
	void setDuracaoEmMinutos(int duracaoEmMinutos);
}
