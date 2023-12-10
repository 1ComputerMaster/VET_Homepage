package com.vet.khw.application.usecase;

import com.vet.khw.domain.Board;

import java.util.List;
import java.util.function.Predicate;

public interface BoardViewUseCase {
    List<Board> getBoards(Predicate<Board> filter);
}
