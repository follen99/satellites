use satpos;

select* from satellites;

select* 
from satellites s
where s.`Country_of_OperatorOwner` = "Italy";

SELECT*
from satellites s
where s.NORAD_Number = 31598;