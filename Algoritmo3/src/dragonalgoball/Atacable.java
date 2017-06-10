package dragonalgoball;

import dragonalgoball.AtaqueEspecialTipo.Absorber;
import dragonalgoball.AtaqueEspecialTipo.ConvierteteEnChocolate;
import dragonalgoball.AtaqueEspecialTipo.Kamehameha;
import dragonalgoball.AtaqueEspecialTipo.Makankosappo;
import dragonalgoball.AtaqueEspecialTipo.Masenko;
import dragonalgoball.AtaqueEspecialTipo.RayoMortal;

 

public interface Atacable {

	public void recibirDanio(Makankosappo tecnica);
	public void recibirDanio(Masenko tecnica);
	public void recibirDanio(RayoMortal tecnica);
	public void recibirDanio(Absorber tecnica); 
	public void recibirDanio(Kamehameha tecnica);
	public void recibirDanio(ConvierteteEnChocolate tecnica);
}
