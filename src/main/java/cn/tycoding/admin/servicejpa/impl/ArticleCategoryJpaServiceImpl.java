package cn.tycoding.admin.servicejpa.impl;

import cn.tycoding.admin.entity.ArticleCategory;
import cn.tycoding.admin.exception.GlobalException;
import cn.tycoding.admin.servicejpa.ArticleCategoryJpaService;
import cn.tycoding.admin.servicejpa.repositiry.ArticleCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther Fys
 * @date 2019/5/1
 */
@Service
public class ArticleCategoryJpaServiceImpl implements ArticleCategoryJpaService
{

    @Autowired
    private ArticleCategoryRepository articleCategoryRepository;

    /**
     * should never be used
     */
    @Override
    public Long findAllCount() {
        if (findAll() == null)
        {
            return 0L;
        }
        return ((long) findAll().size());
    }

    /**
     * should never be used
     */
    @Override
    public List<ArticleCategory> findAll() {
        return articleCategoryRepository.findAll();
    }

    @Override
    @Deprecated
    public List<ArticleCategory> findByPage(ArticleCategory articleCategory) {
        return null;
    }

    @Override
    public ArticleCategory findById(Long id) {
        return articleCategoryRepository.findById(id).get();
    }

    @Override
    @Modifying
    @Transactional
    public void save(ArticleCategory articleCategory) {
        if(!exists(articleCategory)) {
            articleCategoryRepository.save(articleCategory);
        }
        else {
            throw new GlobalException("articleCategory is not exist!!!");
        }
    }

    protected boolean exists(ArticleCategory articleCategory) {
        if(articleCategory == null)
        {
            return false;
        }
        return articleCategoryRepository.existsArticleCategoriesByArticleIdAndAndCategoryId(articleCategory.getArticleId(), articleCategory.getCategoryId());
    }

    @Override
    @Modifying
    @Transactional
    public void update(ArticleCategory articleCategory) {
        if (exists(articleCategory))
        {
            articleCategoryRepository.save(articleCategory);
        }
        else
        {
            throw new GlobalException("Save articleCategory failed!!!");
        }
    }

    @Override
    public void delete(Long... ids) {
        for (Long id : ids)
        {
            articleCategoryRepository.deleteById(id);
        }
    }

    @Override
    @Transactional
    public void deleteByArticleId(Long id) {
        if (id != null) {
            throw new GlobalException("id is null!!!");
        }
        articleCategoryRepository.deleteArticleCategoriesByArticleId(id);
    }

    @Override
    @Transactional
    public void deleteByCategoryId(Long id) {
        if (id != null) {
            throw new GlobalException("id is null!!!");
        }
        articleCategoryRepository.deleteArticleCategoriesByCategoryId(id);
    }
}
