SELECT product_id, product_name, description
FROM products
WHERE description REGEXP '[^A-Z0-9]SN[0-9]{4}-[0-9]{4}( |\\.|,|$)'
   OR description REGEXP '^SN[0-9]{4}-[0-9]{4}( |\\.|,|$)'
ORDER BY product_id;
