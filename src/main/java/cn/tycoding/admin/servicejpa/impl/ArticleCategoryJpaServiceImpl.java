package cn.tycoding.admin.servicejpa.impl;

import cn.tycoding.admin.entity.ArticleCategory;
import cn.tycoding.admin.exception.GlobalException;
import cn.tycoding.admin.mapper.ArticleCategoryMapper;
import cn.tycoding.admin.service.ArticleCategoryService;
import cn.tycoding.admin.servicejpa.ArticleCategoryJpaService;
import cn.tycoding.admin.servicejpa.repositiry.ArticleCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @auther Fys
 * @date 2019/5/1
 */
@Service
public class ArticleCategoryJpaServiceImpl implements ArticleCategoryJpaService
{

    @Autowired
    private ArticleCategoryRepository articleCategoryRepository;

    @Override
    @Deprecated
    public Long findAllCount() {
        return null;
    }

    @Override
    @Deprecated
    public List<ArticleCategory> findAll() {
        return null;
    }

    @Override
    @Deprecated
    public List<ArticleCategory> findByPage(ArticleCategory articleCategory) {
        return null;
    }

    @Override
    @Deprecated
    public ArticleCategory findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void save(ArticleCategory articleCategory) {
        if(!exists(articleCategory)) {
            articleCategoryRepository.save(articleCategory);
        }
    }

    protected boolean exists(ArticleCategory articleCategory) {
        if(articleCategory == null)
        {
            return false;
        }
        return articleCategoryRepository.existsArticleCategoriesByArticleIdAndAndCategoryId(articleCategory.getArticleId(), articleCategory.getCategoryId());
    }

    @Deprecated
    protected boolean exists(Optional<ArticleCategory> articleCategory){
        return false;
    }



    @Override
    @Deprecated
    public void update(ArticleCategory articleCategory) {
    }

    @Override
    @Deprecated
    public void delete(Long... ids) {
    }

    @Override
    @Transactional
    @Deprecated
    public void deleteByArticleId(Long id) {
    }

    @Override
    @Transactional
    @Deprecated
    public void deleteByCategoryId(Long id) {
    }
}
