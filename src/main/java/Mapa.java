class Mapa
{
  int altura;
  int largura;
  int mapa[][];

  public void criar(int alt, int larg)
  {

    this.altura = alt;
    this.largura = larg;

    mapa = new int[this.altura][this.largura];
    
  }

  public void inundar()
  {

    for(int i = 0; i < this.altura; i++)
      for(int j = 0; j < this.largura; j++)
        mapa[i][j] = 0; // codigo da agua
    
  }
  
}