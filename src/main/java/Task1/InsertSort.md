1. Итерация по переменной j от 2 до длины массива A.
2. Значение элемента key устанавливается равным A[j].
3. Индекс i устанавливается равным j - 1.
4. Пока i больше 0 и элемент A[i] больше key, выполняется следующее:
- Элементу A[i] присваивается значение A[i + 1].
- Уменьшаем значение i на 1.
5. Элементу A[i + 1] присваивается значение key.

Таблица с шагами алгоритма (порядок перемещений для каждого элемента) для данного массива A может выглядеть следующим образом:

Итерация j	Элементы A	Перемещения

2.	[5, 1, 4, 2, 8]	 5 -> (позиция 0)

3.	[1, 5, 4, 2, 8] 4 -> (позиция 1)

4.	[1, 4, 5, 2, 8]	2 -> (позиция 1)

5.	[1, 2, 4, 5, 8]	(ничего не перемещается)

После выполнения всех итераций, массив A будет отсортирован в порядке возрастания:

[1, 2, 4, 5, 8]