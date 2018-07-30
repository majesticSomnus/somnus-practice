package com.somnus.practice.bo;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 16:41 2018/7/26
 * @Modified By:
 */
public class FilterKeywordBO {
    private long id;
    /**
     * 敏感词分类
     */
    private int category;
    /**
     * 敏感词
     */
    private String word;
    /**
     * 权重
     */
    public int weight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FilterKeywordBO{" +
                "id=" + id +
                ", category=" + category +
                ", word='" + word + '\'' +
                ", weight=" + weight +
                '}';
    }
}
