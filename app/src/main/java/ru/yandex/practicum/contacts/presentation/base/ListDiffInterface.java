package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<F> {
    public boolean theSameAs(F first);

    public boolean equals(Object obj);
}
