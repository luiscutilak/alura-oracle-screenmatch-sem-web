package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;

public record SerieDTO(Long id,
                       double titulo,
                       String totalTemporadas,
                       String avaliacao,
                       String genero,
                       Categoria atores,
                       String poster,
                       Integer sinopse) {
}
