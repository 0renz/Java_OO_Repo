/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exAula;

/**
 *
 * @author 20222PF.CC0021
 */
public class CursoAprimoramento {
    // codigo, nome, descricao, carga horaria
    private Integer codigo;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    public CursoAprimoramento() {
    }
    


    public CursoAprimoramento(Integer codigo, String nome, String descricao, Integer cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    // sobreescrevendo o metodo toString da classe java.lang.Object (que imprime de forma padrão)
    @Override
    public String toString(){
        return codigo + " : " + nome;
    }
}
