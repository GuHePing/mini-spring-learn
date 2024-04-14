package com.nju.context;

import com.nju.beans.factory.HierarchicalBeanFactory;
import com.nju.beans.factory.ListableBeanFactory;
import com.nju.cores.io.ResourceLoader;

/**
 * 应用上下文
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {
}
