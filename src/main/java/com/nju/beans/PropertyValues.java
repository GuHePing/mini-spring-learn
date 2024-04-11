package com.nju.beans;

import com.nju.beans.PropertyValue;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currentPropertyValue = propertyValueList.get(i);
            if (currentPropertyValue.getName().equals(propertyValue.getName())) {
                // 覆盖属性值
                propertyValueList.set(i, propertyValue);
                return;
            }
        }
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }
}
