<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - стоимость постройки дома</title>
</head>
<body>
<h1>Калькулятор - стоимость постройки дома</h1>
<form action="${pageContext.request.contextPath}/Calc" method="post">

<b><br><label for="inform1">Изменить  данные:</label></b>

<br><br><label for="stoimWidth">Цена за ширину 1 метр:</label>
<input type="text" name="stoimWidth" id="stoimWidth" value="">

<br><br><label for="stoimLength">Цена за длину 1 метр:</label>
<input type="text" name="stoimLength" id="stoimLength" value="">

<br><br><label for="stoimAtazh">Цена за этаж:</label>
<input type="text" name="stoimAtazh" id="stoimAtazh" value="">

<br><br><label for="stoimTsokol">Цена за высоту цоколя 1 метр:</label>
<input type="text" name="stoimTsokol" id="stoimTsokol" value="">

<br><br><label for="stoimDlinaDoma">Цена за длину всего дома 1 метр:</label>
<input type="text" name="stoimDlinaDoma" id="stoimDlinaDoma" value="">

<br><br><label for="stoimPerimetr">Цена за периметр крыши 1 квадратный метр:</label>
<input type="text" name="stoimPerimetr" id="stoimPerimetr" value="">

<b><br><br><label for="inform2">Выберите данные:</label></b>
<br><br><label for="stena">Стена несущая:</label>
<select name="stena">
  <option value="kirp1">Кирпич 1шт.</option>
  <option value="kirp15">Кирпич 1,5шт.</option>
  <option value="kirp2">Кирпич 2шт.</option>
</select>

<br><label for="stoimKirp1">Цена за кирпич 1 шт.:</label>
<input type="text" name="stoimKirp1" id="stoimKirp1" value="">
<br><label for="stoimKirp15">Цена за кирпич 1.5 шт.:</label>
<input type="text" name="stoimKirp15" id="stoimKirp15" value="">
<br><label for="stoimKirp2">Цена за кирпич 2 шт.:</label>
<input type="text" name="stoimKirp2" id="stoimKirp2" value="">

<br><br><label for="otdelka">Отделка наружная:</label>
<select name="otdelka">
  <option value="oblic">Облицованный кирпич</option>
  <option value="shtuk">Штукатурка</option>
  <option value="kamen">Дикий камень</option>
</select>

<br><label for="stoimOblic">Цена за облицованный кирпич:</label>
<input type="text" name="stoimOblic" id="stoimOblic" value="">
<br><label for="stoimShtuk">Цена за штукатурку:</label>
<input type="text" name="stoimShtuk" id="stoimShtuk" value="">
<br><label for="stoimKamen">Цена за дикий камень:</label>
<input type="text" name="stoimKamen" id="stoimKamen" value="">


<br><br><label for="fundam">Фундамент:</label>
<select name="fundam">
  <option value="buronabiv">Буронабивной</option>
  <option value="lent">Ленточный</option>
  <option value="plit">Плитный</option>
</select>

<br><label for="stoimBuronabiv">Цена за буронабивной фундамент:</label>
<input type="text" name="stoimBuronabiv" id="stoimBuronabiv" value="">
<br><label for="stoimLent">Цена за ленточный фундамент:</label>
<input type="text" name="stoimLent" id="stoimLent" value="">
<br><label for="stoimPlit">Цена за плитный фундамент:</label>
<input type="text" name="stoimPlit" id="stoimPlit" value="">


<br><br><label for="vnutr">Внутр. перегородка:</label>
<select name="vnutr">
  <option value="yes">Да</option>
  <option value="no">Нет</option>
</select>

<br><label for="stoimYes">Цена за внутр. перегородки:</label>
<input type="text" name="stoimYes" id="stoimYes" value="">


<br><br><label for="krsha">Крыша:</label>
<select name="krsha">
  <option value="metall">Металлочерепица</option>
  <option value="krovl">мягкая кровля</option>
</select>


<br><label for="stoimMetall">Цена за крышу из металлочерепицы:</label>
<input type="text" name="stoimMetall" id="stoimMetall" value="">
<br><label for="stoimKrovl">Цена за крышу из мягкой кровли:</label>
<input type="text" name="stoimKrovl" id="stoimKrovl" value="">

<br><br><label for="oknaDveri">Окна + мет.двери:</label>
<select name="oknaDveri">
  <option value="da">Да</option>
  <option value="net">Нет</option>
</select>

<br><label for="stoimDa">Цена за окна и мет.двери:</label>
<input type="text" name="stoimDa" id="stoimDa" value="">

<br><br><input type="submit" name="sign1" value="Вывести список подгруппы ">
<br><br><input type="submit" name="sign" value="Рассчитать ">
<br><br><label for="summ">Цена:</label>
<label for="summ1"></label>
<label for="ryb">руб.</label>

 </form>
</body>
</html>