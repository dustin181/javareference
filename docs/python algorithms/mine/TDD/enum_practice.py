from enum import Enum


class Cookie(Enum):
    CHOCOLATE = "chocolate"
    SUGAR = "sugar"
    OATMEAL = "oatmeal"
    SHORTBREAD = "shortbread"


print(Cookie.SHORTBREAD)