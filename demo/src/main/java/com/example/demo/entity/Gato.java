package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Gato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "descricao")
    private String descricao;

    @ManyToMany
    @JoinTable(
        name = "gato_dono",
        joinColumns = @JoinColumn(name = "gato_id"),
        inverseJoinColumns = @JoinColumn(name = "dono_id")
    )
    private Set<Dono> donos;

    @ManyToMany
    @JoinTable(
        name = "gato_vacina",
        joinColumns = @JoinColumn(name = "gato_id"),
        inverseJoinColumns = @JoinColumn(name = "vacina_id")
    )
    private Set<Vacina> vacinas;

    // Construtor padrão
    public Gato() {
        // Aqui você pode inicializar variáveis ou deixar vazio
    }

    // Construtor com parâmetros
    public Gato(String nome, String descricao, Set<Dono> donos, Set<Vacina> vacinas) {
        this.nome = nome;
        this.descricao = descricao;
        this.donos = donos;
        this.vacinas = vacinas;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<Dono> getDonos() {
		return donos;
	}

	public void setDonos(Set<Dono> donos) {
		this.donos = donos;
	}

	public Set<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(Set<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

    
}

