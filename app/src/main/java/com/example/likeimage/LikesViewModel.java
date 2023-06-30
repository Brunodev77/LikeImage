package com.example.likeimage;

import androidx.lifecycle.MutableLiveData;

public class LikesViewModel {
    private MutableLiveData<String> nome;
    private MutableLiveData<String> sobrenome;
    private MutableLiveData<Integer> like;
    private MutableLiveData<Integer> image;

    public LikesViewModel(MutableLiveData<String> nome, MutableLiveData<String> sobrenome, MutableLiveData<Integer> like, MutableLiveData<Integer> image) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.like = like;
        this.image = image;
    }

    public MutableLiveData<String> getNome() {
        return nome;
    }

    public MutableLiveData<String> getSobrenome() {
        return sobrenome;
    }

    public MutableLiveData<Integer> getLike() {
        return like;
    }

    public MutableLiveData<Integer> getImage() {
        return image;
    }

    public void darLike(MutableLiveData<Integer> like) {
        this.like = like;
    }
}
