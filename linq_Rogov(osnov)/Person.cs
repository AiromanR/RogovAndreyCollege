using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace rogovLinq
{
    internal class Person
    {
        public string surname { get; set; }
        public string name { get; set; }
        public string patronimic { get; set; }
        public int age { get; set; }
        public double weight { get; set; }

        public override string ToString()
        {
            return $"{surname} {name} {patronimic}, Возраст: {age}, Вес: {weight} кг";
        }
    }
}
