<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - стоимость постройки дома</title>
<style>
body{

background: #c7b39b url(p1.jpg);
color: #FFFFFF;
}
</style>


<script type="text/javascript">
    function isGroup(){
      alert("Список : 1. Симаков Максим 2. Асьянов Арслан 3. Рогова Анастасия 4. Шайхутдинов Тимур");
    }

    function isBack(){

      return document.body.style.background = '#c7b39b url(avt.jpg)';

    }
</script>

</head>
<body>
<h1 style="background:#654321">Калькулятор - стоимость постройки дома</h1>
<form action="${pageContext.request.contextPath}/main" method="post">


<b><br><label for="inform1" style="background:#654321" >Введите данные:</label></b>

<br><br><label for="width" style="background:#654321">Ширина (в метрах):</label>
<input type="text" name="width" id="width" value="${width}">

<br><br><label for="length" style="background:#654321">Длина (в метрах):</label>
<input type="text" name="length" id="length" value="">

<br><br><label for="atazh" style="background:#654321">Этажность (кол-во):</label>
<input type="text" name="atazh" id="atazh" value="">

<br><br><label for="tsokol" style="background:#654321">Высота цоколя (в метрах):</label>
<input type="text" name="tsokol" id="tsokol" value="">

<br><br><label for="dlinaDoma" style="background:#654321">Длина всего дома (в метрах):</label>
<input type="text" name="dlinaDoma" id="dlinaDoma" value="">

<br><br><label for="perimetr" style="background:#654321">Периметр крыши (в квадратных метрах):</label>
<input type="text" name="perimetr" id="perimetr" value="">

<b><br><br><label for="inform2" style="background:#654321">Выберите данные:</label></b>
<br><br><label for="stena" style="background:#654321">Стена несущая:</label>
<select name="stena">
  <option value="kirp1">Кирпич 1шт.</option>
  <option value="kirp15">Кирпич 1,5шт.</option>
  <option value="kirp2">Кирпич 2шт.</option>
</select>

<br><br><label for="otdelka" style="background:#654321">Отделка наружная:</label>
<select name="otdelka">
  <option value="oblic">Облицованный кирпич</option>
  <option value="shtuk">Штукатурка</option>
  <option value="kamen">Дикий камень</option>
</select>

<br><br><label for="fundam" style="background:#654321">Фундамент:</label>
<select name="fundam">
  <option value="buronabiv">Буронабивной</option>
  <option value="lent">Ленточный</option>
  <option value="plit">Плитный</option>
</select>

<br><br><label for="vnutr" style="background:#654321">Внутр. перегородка:</label>
<select name="vnutr">
  <option value="yes">Да</option>
  <option value="no">Нет</option>
</select>

<br><br><label for="krsha" style="background:#654321">Крыша:</label>
<select name="krsha">
  <option value="metall">Металлочерепица</option>
  <option value="krovl">мягкая кровля</option>
</select>

<br><br><label for="oknaDveri" style="background:#654321">Окна + мет.двери:</label>
<select name="oknaDveri">
  <option value="da">Да</option>
  <option value="net">Нет</option>
</select>
<br><br><input type="submit" name="sign2" value="Рассчитать ">
<br><br><input type="submit" value="Вывести список группы" onclick="isGroup()">
<br><br><input type="submit" value="Поменять фон" onclick="isBack()">
<p>Цена:<span id="result" style="background:#654321">${result}</span>руб</p>
<p>Список группы : <span id="result" style="background:#654321">${ollist}</span></p>
 </form>
</body>
</html>
