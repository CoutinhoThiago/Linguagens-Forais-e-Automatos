package interfaces.espefcificas.media;

import java.util.List;

import interfaces.IEmprestar;
import interfaces.espefcificas.IMedia;

public interface IFilme extends IMedia, IEmprestar {
	List<String> getAtores();
	void setAtores(List<String> atores);
}