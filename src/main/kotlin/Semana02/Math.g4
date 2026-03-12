lexer grammar Math;

NUMBER: '-'[0-9]('.'[0-9]+)?;
OPERATION: '-'|'+'|'/'|'*'|'^';
OPEN: '(';
CLOSE: ')';
SPACE: ' ' -> skip;